package forme.clan;

import domen.Clan;
import domen.Ljubimac;
import domen.Zivotinja;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ivana
 */
public class ModelTabeleLjubimac extends AbstractTableModel {

    private Clan clan;
    private DefaultComboBoxModel dcbm;

    public ModelTabeleLjubimac(Clan clan, DefaultComboBoxModel dcbm) {
        this.clan = clan;
        this.dcbm = dcbm;
    }
    private String[] nazivi = {"RB", "Ime", "Datum spasavanja", "Zivotinja"};

    @Override
    public int getRowCount() {
        return clan.getListaLjubimaca().size();
    }

    @Override
    public int getColumnCount() {
        return nazivi.length;
    }

    @Override
    public String getColumnName(int column) {
        return nazivi[column];
    }

    public void dodajLjubimca() {
        Ljubimac lj = new Ljubimac();
        lj.setLjubimacID(clan.getListaLjubimaca().size() + 1);
        lj.setVlasnik(clan);
        lj.setDatumSpasavanja(new Date());
        clan.getListaLjubimaca().add(lj);
        fireTableDataChanged();
    }

    public void izbrisiLjubimca(int i) {
        clan.getListaLjubimaca().remove(i);
        fireTableDataChanged();
    }

    public Ljubimac vratiLjubimca(int i) {
        return clan.getListaLjubimaca().get(i);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ljubimac ljubimac = clan.getListaLjubimaca().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ljubimac.getLjubimacID();
            case 1:
                return ljubimac.getImeLjubimca();
            case 2:
                String datum = "";
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    datum = sdf.format(ljubimac.getDatumSpasavanja());

                } catch (Exception e) {
                    System.out.println("Datum ne moze da se formatira");
                }

                return datum;
            case 3:
                dcbm.setSelectedItem(ljubimac.getVrstaZivotinje());
                return ljubimac.getVrstaZivotinje().getNaziv();
            default:
                return "greska";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Ljubimac ljubimac = clan.getListaLjubimaca().get(rowIndex);
        switch (columnIndex) {
            case 0:
                ljubimac.setLjubimacID((int) aValue);
                break;
            case 1:
                ljubimac.setImeLjubimca(String.valueOf(aValue));
                break;
            case 2:

                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date datumSpasavanja = sdf.parse(String.valueOf(aValue));
                    ljubimac.setDatumSpasavanja(datumSpasavanja);
                } catch (Exception e) {
                    System.out.println("Datum ne moze da se formatira");
                }
                break;
            case 3:
                ljubimac.setVrstaZivotinje((Zivotinja) aValue);

                break;
        }
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public DefaultComboBoxModel getDcbm() {
        return dcbm;
    }

    public void setDcbm(DefaultComboBoxModel dcbm) {
        this.dcbm = dcbm;
    }

}
