public interface LanguageTranslator 
{
    public String DEFAULT_TRANSLATION = "EN";
    // Translates the language from default language
    public String fromDefaultLanguage(String languageTokens);
}
