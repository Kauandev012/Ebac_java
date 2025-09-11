package copiaAula.adapter;

import java.io.File;

public interface PersistenciaArquivos {

   void gravar(File file);

    void ler(String caminho);
}
