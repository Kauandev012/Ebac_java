package tarefaReflection;

public class AppReflection {

    public static void main(String[] args) {
        executaAnnotation();
    }


    public static void executaAnnotation(){
        Class<?> clazz = TabelaClass.class;

        if(clazz.isAnnotationPresent(ItabelaAnnotatio.class)){
            ItabelaAnnotatio annotation = clazz.getAnnotation(ItabelaAnnotatio.class);
            System.out.println(annotation.value());
        } else {
            System.out.println("Annotation não encontrada!");
        }
    }
}
