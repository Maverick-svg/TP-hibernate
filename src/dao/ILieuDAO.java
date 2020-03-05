package dao;

import java.util.List;

import fr.adaming.model.Lieu;

public interface ILieuDAO {

	public int creatLieu(Lieu l1);
	public List<Lieu> getLieu();
}
