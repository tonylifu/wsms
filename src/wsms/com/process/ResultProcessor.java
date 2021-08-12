package wsms.com.process;

import javafx.concurrent.Task;
import wsms.com.controller.OmniLoginControl;

public class ResultProcessor extends Task<String> {
	
	private OmniLoginControl omniLogin;
	private String stdClassId;
	
	public ResultProcessor(OmniLoginControl omniLogin, String stdClassId) {
		this.omniLogin = omniLogin;
		this.stdClassId = stdClassId;
	}

	@Override
	public String call() throws Exception {
		int numberProcessed = omniLogin.resultProcessor(stdClassId);
		return String.valueOf(numberProcessed)+" numbers of results processed successfully";
	}

}
