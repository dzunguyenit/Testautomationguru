package multiEnviroment;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

public class multiEnviroment {
	@Sources({ "file:data/${env}.properties" })
	public interface Environment extends Config {

		String url();

		String username();

		String password();

		@Key("db.hostname")
		String getDBHostname();

		@Key("db.port")
		int getDBPort();

		@Key("db.username")
		String getDBUsername();

		@Key("db.password")
		String getDBPassword();
	}
}
