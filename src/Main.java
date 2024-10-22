import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 1. создать новый ArrayList, добавить несколько цветов и вывести коллекцию
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Красный");
		colors.add("Синий");
		colors.add("Зелёный");
		System.out.println("Цвета: " + colors);

		// 2. пройтись по всем элементам в ArrayList
		System.out.println("Итерация по элементам:");
		for (String color : colors) {
			System.out.println(color);
		}

		// 3. вставить элемент в ArrayList на первую позицию
		colors.add(0, "Жёлтый");
		System.out.println("После добавления Жёлтого на первую позицию: " + colors);

		// 4. получить элемент из ArrayList
		String retrievedElement = colors.get(2);
		System.out.println("Элемент на индексе 2: " + retrievedElement);

		// 5. обновить конкретный элемент массива заданным элементом
		colors.set(1, "Фиолетовый");
		System.out.println("После обновления элемента на индексе 1 на Фиолетовый: " + colors);

		// 6. удалить третий элемент из ArrayList
		colors.remove(2);
		System.out.println("После удаления третьего элемента: " + colors);

		// 7. поиск элемента в ArrayList
		boolean containsBlue = colors.contains("Синий");
		System.out.println("Содержит ли список 'Синий'? " + containsBlue);

		// 8. отсортировать ArrayList
		Collections.sort(colors);
		System.out.println("Отсортированный ArrayList: " + colors);

		// 9. скопировать один ArrayList в другой
		ArrayList<String> newColors = new ArrayList<>(colors);
		System.out.println("Скопированный ArrayList: " + newColors);

		// 10. перевернуть элементы в ArrayList
		Collections.reverse(colors);
		System.out.println("Перевёрнутый ArrayList: " + colors);

		// 11. сравнить два ArrayList
		boolean areEqual = colors.equals(newColors);
		System.out.println("Равны ли два ArrayList? " + areEqual);

		// 12. очистить ArrayList
		colors.clear();
		System.out.println("ArrayList после очистки: " + colors);

		// 13. проверить, пуст ли ArrayList
		boolean isEmpty = colors.isEmpty();
		System.out.println("Пуст ли ArrayList? " + isEmpty);

		// 14. увеличить размер ArrayList
		colors.ensureCapacity(20);
		colors.add("Розовый");
		colors.add("Бирюзовый");
		System.out.println("ArrayList после увеличения размера и добавления новых элементов: " + colors);

		// 15. уменьшить емкость ArrayList до текущего размера
		colors.trimToSize();
		System.out.println("ArrayList после уменьшения емкости: " + colors);
	}
}