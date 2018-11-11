package English.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: (timestamp generation disabled)
 */
public class KYGas extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(42);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: commenSense
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "commenSense", "commenSense.wav", ""); 

		// phrase: transferOwnshipHints
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "transferOwnshipHints", "transferOwnshipHints.wav", ""); 

		// phrase: applyGasHints
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "applyGasHints", "applyGasHints.wav", ""); 

		// phrase: gasPrice
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "gasPrice", "gasPrice.wav", ""); 

		// phrase: emergency
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "emergency", "emergency.wav", ""); 

		// phrase: night_pre
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "night_pre", "night_pre.wav", ""); 

		// phrase: nightMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "nightMenu", "nightMenu.wav", ""); 

		// phrase: BusinessQryMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BusinessQryMenu", "BusinessQryMenu.wav", ""); 

		// phrase: dayHints
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "dayHints", "dayHints.wav", ""); 

		// phrase: stopGas
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "stopGas", "stopGas.wav", ""); 

		// phrase: Welcome_2
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Welcome_2", "Welcome_2.wav", ""); 

		// phrase: Important_Report
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Important_Report", "Important_Report.wav", ""); 

		// phrase: NoticeMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoticeMenu", "NoticeMenu.wav", ""); 

		// phrase: Notice0501
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Notice0501", "Notice0501.wav", ""); 

		// phrase: Notice0502
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Notice0502", "Notice0502.wav", ""); 

		// phrase: Notice0503
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Notice0503", "Notice0503.wav", ""); 

		// phrase: Notice0504
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Notice0504", "Notice0504.wav", ""); 

		// phrase: GasFeeQryTemp
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "GasFeeQryTemp", "GasFeeQryTemp.wav", ""); 

		// phrase: Biz4nightMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Biz4nightMenu", "Biz4nightMenu.wav", ""); 

		// phrase: satisifyMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "satisifyMenu", "satisifyMenu.wav", ""); 

		// phrase: ThankYou
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ThankYou", "ThankYou.wav", ""); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(KYGas.PHRASE_MAP, phraseName));
	}
}
