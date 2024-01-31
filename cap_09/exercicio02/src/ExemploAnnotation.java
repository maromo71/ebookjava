import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Definição da Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogMetodo {
    String value() default "Método executado.";
}

// Classe para aplicar a annotation
class ExemploComAnnotation {
    @LogMetodo(value = "Log: métodoA chamado.")
    public void metodoA() {
        System.out.println("Executando método A.");
    }

    @LogMetodo
    public void metodoB() {
        System.out.println("Executando método B.");
    }

    public static void main(String[] args) throws Exception {
        ExemploComAnnotation exemplo = new ExemploComAnnotation();
        Method[] metodos = exemplo.getClass().getDeclaredMethods();

        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(LogMetodo.class)) {
                LogMetodo annotation = metodo.getAnnotation(LogMetodo.class);
                System.out.println(annotation.value());
                metodo.invoke(exemplo);
            }
        }
    }
}
