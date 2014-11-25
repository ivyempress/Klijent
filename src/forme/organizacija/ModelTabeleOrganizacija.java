package forme.organizacija;

import domen.Organizacija;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTabeleOrganizacija extends AbstractTableModel {

    private List<Organizacija> listaOrganizacija;

    public ModelTabeleOrganizacija(List<Organizacija> listaOrganizacija) {
        this.listaOrganizacija = listaOrganizacija;
    }
    String[] naziviKolona = {"ID", "Naziv", "Osnivac", "Osnovan", "Opis"};

    @Override
    public int getRowCount() {
        return listaOrganizacija.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Organizacija o = listaOrganizacija.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return o.getOrganizacijaID();
            case 1:
                return o.getNazivOrganizacije();
            case 2:
                return o.getImeOsnivaca();
            case 3:
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                return sdf.format(o.getDatumOsnivanja());
            case 4:
                return o.getOpisDelatnosti();
            default:
                return "Greska";

        }
    }

    public List<Organizacija> getListaOrganizacija() {
        return listaOrganizacija;
    }

    public void setListaOrganizacija(List<Organizacija> listaOrganizacija) {
        this.listaOrganizacija = listaOrganizacija;
    }

}
