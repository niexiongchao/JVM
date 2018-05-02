package com.cs.b602.yufatang;

import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementScanner8;
import javax.tools.Diagnostic.Kind;

public class NameChecker {
	
	private final Messager messager;
	
	NameCheckScanner nameCheckScanner = new NameCheckScanner();
	public NameChecker(ProcessingEnvironment processingEnvironment) {
		// TODO Auto-generated constructor stub
		this.messager = processingEnvironment.getMessager();
	}
	
	public class NameCheckScanner extends ElementScanner8<Void, Void> {
		@Override 
		public Void visitType(TypeElement e,Void p){
			scan(e.getTypeParameters(),p);
			checkCamelCase(e,true);
			super.visitType(e, p);
			
			
			return null;
			
			
			
		}
		

		private void checkCamelCase(TypeElement e, boolean b) {
			// TODO Auto-generated method stub
			String name=e.getSimpleName().toString();
			boolean previousUpper=false;
			boolean conventional =true;
			int firstCodePoint =name.codePointAt(0);
			
			if(Character.isUpperCase(firstCodePoint)){
				previousUpper = true;
				if(!b){
					
					messager.printMessage(Kind.WARNING, "名称"+name+"小写字母开头",e);
					return;
					
					
				}else if(!Character.isLowerCase(firstCodePoint)){
					
					if(b){
						
						messager.printMessage(Kind.WARNING, "名称"+name+"应当以大写字母开头",e);
						return;

					}else{
						
						conventional = false;	
					}
					
					if(conventional){
						
						int cp = firstCodePoint;
						for(int i=Character.charCount((cp));i<name.length();i+=Character.charCount(cp)){
							cp=name.codePointAt(i);
							if(Character.isUpperCase(cp)){
								if(previousUpper){
									conventional=false;
								break;

							}
							previousUpper =true;
						}else{
							
							previousUpper = false;
							
						}
						
					}
					
				}
				
				if(!conventional)
					messager.printMessage(Kind.WARNING, "名称"+name+"应当符合驼式命名法则",e);
				
				
			}
		}
	}
	
	}
	
}
