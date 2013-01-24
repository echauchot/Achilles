package parser.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import fr.doan.achilles.entity.type.WideMap;

/**
 * BeanWithJoinColumnAsEntity
 * 
 * @author DuyHai DOAN
 * 
 */
@Entity
public class BeanWithJoinColumnAsEntity
{
	@Id
	private Long id;

	@JoinColumn
	private WideMap<Integer, Bean> wide;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public WideMap<Integer, Bean> getWide()
	{
		return wide;
	}

	public void setWide(WideMap<Integer, Bean> wide)
	{
		this.wide = wide;
	}
}
