package Chinese.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2016年8月29日 上午10时47分44秒
 */
public class CQGas extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(44);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: Noinput_003
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Noinput_003", "Noinput_003.wav", ""); 

		// phrase: Nomatch_004
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Nomatch_004", "Nomatch_004.wav", ""); 

		// phrase: ErrorCtsLimit_005
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ErrorCtsLimit_005", "ErrorCtsLimit_005.wav", ""); 

		// phrase: TransferAgent_008
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "TransferAgent_008", "TransferAgent_008.wav", ""); 

		// phrase: Welcome_010
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Welcome_010", "Welcome_010.wav", ""); 

		// phrase: ErrorCustNo_022
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ErrorCustNo_022", "ErrorCustNo_022.wav", ""); 

		// phrase: InputMonth_006
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "InputMonth_006", "InputMonth_006.wav", ""); 

		// phrase: ErrorMonth_023
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ErrorMonth_023", "ErrorMonth_023.wav", ""); 

		// phrase: MainMenu_001
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "MainMenu_001", "MainMenu_001.wav", ""); 

		// phrase: InputCustNum_002
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "InputCustNum_002", "InputCustNum_002.wav", ""); 

		// phrase: blank_025
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "blank_025", "black_025.wav", ""); 

		// phrase: ReplayBack_009
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ReplayBack_009", "ReplayBack_009.wav", ""); 

		// phrase: 0601
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "0601", "0601.wav", ""); 

		// phrase: 0602
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "0602", "0602.wav", ""); 

		// phrase: 0603
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "0603", "0603.wav", ""); 

		// phrase: 0604
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "0604", "0604.wav", ""); 

		// phrase: 0605
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "0605", "0605.wav", ""); 

		// phrase: BusiConsMenu_019
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BusiConsMenu_019", "BusiConsMenu_019.wav", ""); 

		// phrase: NoticeMenu_007
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoticeMenu_007", "NoticeMenu_007.wav", ""); 

		// phrase: ServiceMenu_011
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ServiceMenu_011", "ServiceMenu_011.wav", ""); 

		// phrase: waiting
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "waiting", "waiting.wav", ""); 

		// phrase: 0701
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "0701", "0701.wav", ""); 

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
	 * Last generated by Orchestration Designer at: 2017年2月7日 上午12时44分26秒
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(CQGas.PHRASE_MAP, phraseName));
	}
}
