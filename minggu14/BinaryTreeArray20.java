package minggu14;
public class BinaryTreeArray20 {
    Mahasiswa20[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray20() {
        dataMahasiswa = new Mahasiswa20[10];
        idxLast = -1;
    }

    void populateData(Mahasiswa20 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast){ 
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
}