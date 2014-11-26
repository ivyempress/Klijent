package forme.clan;

import domen.Clan;
import domen.Ljubimac;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ivana
 */
public class ModelTabeleClan extends AbstractTableModel {

    private List<Clan> listaClanova;
    private String[] nazivi = {"JMBG", "Ime", "Prezime", "Rodjen", "Uclanjen", "Organizacija", "Grad", "Ljubimci"};

    public ModelTabeleClan(List<Clan> listaClanova) {
        this.listaClanova = listaClanova;
    }
    public Clan vratiClana(int i){
        return listaClanova.get(i);
    }
    public void obrisiClana(int i){
        listaClanova.remove(i);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaClanova.size();
    }

    @Override
    public int getColumnCount() {
        return nazivi.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clan c = listaClanova.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getJmbg();
            case 1:
                return c.getIme();
            case 2:
                return c.getPrezime();
            case 3:
                return c.getDatumRodjenja();
            case 4:
                return c.getDatumUclanjenja();
            case 5:
                return c.getOrganizacija().getNazivOrganizacije();
            case 6:
                return c.getDrzava().getNazivGrada();
            case 7:
                String ljubimci = "";
                for (Ljubimac ljubimac : c.getListaLjubimaca()) {
                    ljubimci = ljubimci  + ljubimac.getImeLjubimca()+ ", ";
                }
                return ljubimci;
            default : return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        return nazivi[column];
    }

    public List<Clan> getListaClanova() {
        return listaClanova;
    }

    public void setListaClanova(List<Clan> listaClanova) {
        this.listaClanova = listaClanova;
    }

}
