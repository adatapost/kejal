package in.abc;

public class Emp implements IEmp {

	private int id;
	private String name;

	/* (non-Javadoc)
	 * @see in.abc.IEmp#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see in.abc.IEmp#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see in.abc.IEmp#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see in.abc.IEmp#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
}
