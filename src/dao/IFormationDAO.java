package dao;

import java.util.List;

import fr.adaming.model.Formation;

public interface IFormationDAO {

	public int addFormation(Formation fr);
	public List<Formation> getFormation();
	
}
