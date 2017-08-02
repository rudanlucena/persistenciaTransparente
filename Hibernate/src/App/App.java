package App;


import DAO.ClubeDao;
import entidades.Clube;

public class App {
    public static void main(String[] args){
        
        ClubeDao dao = ClubeDao.getInstance();
        Clube clube = new Clube();
        clube.setNome("vasco");
        clube.setCidade("RJ");
        clube.setEstadio("São Januario");
        clube.setDivisao(1);
        
        dao.persist(clube);
        
    }
}
