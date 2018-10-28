package parallel;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class StartProcess {
	public void startProcessNormal() throws IOException {
		ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","netstat","-a");
		Process process = pb.start();
		InputStream inputStream = process.getInputStream();
		Files.copy(inputStream, Paths.get("netstat.txt"), StandardCopyOption.REPLACE_EXISTING);
		
	}
	
	public static void main(String[] args) {
		StartProcess s = new StartProcess();
		try {
			s.startProcessNormal();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
