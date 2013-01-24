package parser.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import fr.doan.achilles.entity.type.WideMap;

/**
 * BeanWithJoinColumnAsWideRow
 * 
 * @author DuyHai DOAN
 * 
 */
@Entity
public class BeanWithJoinColumnAsWideRow
{
	@Id
	private Long id;

	@JoinColumn(table = "my_wide_row_cf")
	private WideMap<Integer, String> wideMap;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public WideMap<Integer, String> getWideRow()
	{
		return wideMap;
	}

	public void setWideRow(WideMap<Integer, String> wideRow)
	{
		this.wideMap = wideRow;
	}
}
