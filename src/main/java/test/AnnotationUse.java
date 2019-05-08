package test;

@MyAnnotation
public class AnnotationUse {
    public static void main(String[] args) {
        if (AnnotationUse.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = AnnotationUse.class.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.color());
        }
    }
}
