package copiaAula.adapter;

import java.io.File;

public class DropBoxAdapter implements PersistenciaArquivos{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox  dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        dropBox.download(new DropBox(file.getAbsolutePath()));
    }

    @Override
    public void ler(String caminho) {

    }
}
