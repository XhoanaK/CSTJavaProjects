package project6;
import java.util.Comparator;

public class Project6 {
	public static void main(String[] args) {
        GeometricObject[] list = {
                new Circle(3.0),
                new Rectangle(3, 5),
                
        };


        System.out.println("Before sort");
        for (GeometricObject o : list) {
            System.out.println(o.getArea());
        }


        Sort(list, new Comparator<GeometricObject>() {
            @Override
            public int compare(GeometricObject o1, GeometricObject o2) {
                double a1 = o1.getArea();
                double a2 = o2.getArea();
                if (a1 > a2)
                    return 1;
                if (a1 == a2)
                    return 0;
                else
                    return -1;
            }
        });

        System.out.println("After sort");
        for (GeometricObject o : list) {
            System.out.println(o.getArea());
        }

    }
	

    public static <E> void Sort(E[] array, Comparator<? super E> comparator) {

        for (int i = 0; i < array.length - 1; i++) {

            E currentMin = array[i];
            int minIndex = i;
            for (int k = i + 1; k < array.length; k++) {
                if (comparator.compare(array[k], currentMin) < 0) {
                    currentMin = array[k];
                    minIndex = k;
                }
            }

            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
