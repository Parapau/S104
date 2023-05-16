package N1E1;

import java.util.ArrayList;
import java.util.List;

public class Mesos {

	List<String> mesos = new ArrayList<String>();
	
	public Mesos() {
		mesejar();
	}

	public List<String> getMesos() {
		return mesos;
	}

	public void setMesos(List<String> mesos) {
		this.mesos = mesos;
	}
	

	public void mesejar() {
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
	}

}
