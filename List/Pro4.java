import java.util.ArrayList;
import java.util.List;

class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double || e instanceof Short || e instanceof Byte || e instanceof Long) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only number format is supported.");
		}
	}
}

public class Pro4 {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(15);
			list.add(1.24F);
			list.add(3.1415D);
			list.add("Test");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);

	}

}
