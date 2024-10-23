import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<TarefaTabela> clazz = TarefaTabela.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela anotacaoTabela = clazz.getAnnotation(Tabela.class);

            String nomeDaTabela = anotacaoTabela.value();

            System.out.println("Nome da tabela: " + nomeDaTabela);
        } else {
            System.out.println("A anotação @Tabela não foi encontrada.");
        }
    }
}

