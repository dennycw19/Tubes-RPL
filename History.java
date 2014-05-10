/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smart.lamp;


/**
 *
 * @author Denny Cahyo
 */
public class History {
        private String id,tgl, wkt;
        Database db = new Database();
    /**
     * @return the tgl
     */
    public String getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the wkt
     */
    public String getWkt() {
        return wkt;
    }

    /**
     * @param wkt the wkt to set
     */
    public void setWkt(String wkt) {
        this.wkt = wkt;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    public void saveHistory(String id, String tgl, String wkt){
        String s = "insert into history values('"+id+"','" +tgl+ "','" +wkt+ "')";
        db.query(s);
    }
    public void resetTable(){
        String s = "truncate table history";
        db.query(s);
    }
}
