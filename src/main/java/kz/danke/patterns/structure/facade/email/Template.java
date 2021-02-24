package kz.danke.patterns.structure.facade.email;

public abstract class Template {

	public enum TemplateType {Email, NewsLetter};
	
	public abstract String format(Object obj);
	
}
