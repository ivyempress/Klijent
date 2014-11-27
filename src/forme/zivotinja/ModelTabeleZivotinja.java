/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.zivotinja;

import domen.Zivotinja;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ivana
 */
public class ModelTabeleZivotinja extends AbstractTableModel{
   private List<Zivotinja> listaZivotinja;
    String[] naziviKolona = {"zivotinjaID", "Naziv", "Opis vrste"};

    public ModelTabeleZivotinja(List<Zivotinja> listaZIvotinja) {
        this.listaZivotinja = listaZIvotinja;
    }

    public Zivotinja vratiZivotinju(int i) {
        return listaZivotinja.get(i);
    }
    public void obrisiOZivotinju(int i){
        listaZivotinja.remove(i);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaZivotinja.size();
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
        Zivotinja z = listaZivotinja.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return z.getZivotinjaID();
            case 1:
                return z.getNaziv();
            case 2:
                return z.getOpisVrste();
            
            default:
                return "Greska";

        }
    }

    public List<Zivotinja> getListaZivotinja() {
        return listaZivotinja;
    }

    public void setListaZivotinja(List<Zivotinja> listaZivotinja) {
        this.listaZivotinja = listaZivotinja;
    } 
}
