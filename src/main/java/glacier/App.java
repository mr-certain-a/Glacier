package glacier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import lombok.SneakyThrows;
import lombok.val;

public class App {
	
	/**
	 o ファイル名から氏名を抽出する
	 o 【支払明細】202101_100034_難波陽介.pdf -> 難波陽介
	 o ※拡張子を外したあと、後ろから検索して最初に出てきた _ までを名前とする
	 */
	protected String getNameFromFilePath(Path path) {
		// TODO:
		return null;
	}
	
	public static class SMTPInfo {
		public String host;
		public int port;
		public String from;
		public String password;
	}
	
	/**
	 o SMTP設定ファイルから読み込む
	 */
	protected SMTPInfo loadSMTPSettings(Path path) {
		return null;
	}
	
	/**
	 o メールアドレスリストのマップを返却する
	 */
	protected Map<String, String> loadMailList(Path path) {
		return null;
	}
	
	protected String content() {
		return "定型文";
	}

	protected void send(SMTPInfo smtp, String toAddr, String name, Path attachementFile) {
		
		
		
		
	}
	
	// 本当はUnitTest(後で移行)
	@SneakyThrows
	public void sendTest() {
		
		val at = Files.createFile(Paths.get("./tempfile"));
		
		val smtp = new SMTPInfo();
		smtp.from = "";
		smtp.password = "";
		smtp.port = 28;
		smtp.host = "";
		
		send(smtp, "namba@heisei-intelligence.com", "namba", at);
	}
	

	
	/**
	 * send summary mail.
	 * @param content
	 */
	protected void summary(String content) {
		
	}

    public static void main(String[] args) {
        System.out.println("glasier start.");
        
               
        
    }
}
