import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Es1 {
	public static void main(String[] args) {

		HashMap<String, Integer> nome = new HashMap<String, Integer>();

		nome.put("Angelo Fazari", 28);
		nome.put("Giovanna Pochi", 28);

		System.out.println(nome);

		System.out.println(nome.size());

//		nome.clear();
//		System.out.println(nome);

		System.out.println(nome.isEmpty());

		nome.get("Giovanna Pochi");
		System.out.println(nome.get("Giovanna Pochi"));

		System.out.println(nome.containsValue(28));

		Set set = nome.entrySet();
		System.out.println(set);

		int eta = nome.get("Giovanna Pochi");
		System.out.println(eta);

		for (Entry <String, Integer> entry : nome.entrySet()) {
			if(entry.getValue().equals(28))
				System.out.println(entry.getKey());

		}

	}

}
