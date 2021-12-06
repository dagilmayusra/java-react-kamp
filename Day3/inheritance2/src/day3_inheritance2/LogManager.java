package day3_inheritance2;

public class LogManager {

	public void log(int logType) {

		if(logType ==1) {
			System.out.println("Veri tabaný loglandý");
		}else if(logType ==2) {
			System.out.println("Dosya loglandý");
		}else {
			System.out.println("email gönderildi");
		}
	}
}
