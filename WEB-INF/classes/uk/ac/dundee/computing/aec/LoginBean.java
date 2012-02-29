package uk.ac.dundee.computing.aec;

public class LoginBean 
{  
	int id;
	String FirstName;
	String Surname;
	String Email;
	String Town;
	String Status;
	public int getid()
	{
		return id;
	}
	public String getFirstName()
	{
		return FirstName;
	}
	public String getSurname()
	{
		return Surname;
	}
	public String getEmail()
	{
		return Email;
	}
	public String getTown()
	{
		return Town;
	}
	public String getStatus()
	{
		return Status;
	}
	public void setid(int iD)
	{
		this.id=iD;
	}
	public void setFirstName(String firstName)
	{
		this.FirstName = firstName;
	}
	public void setSurname(String surname)
	{
		this.Surname = surname;
	}
	public void setEmail(String email)
	{
		this.Email = email;
	}
	public void setTown(String town)
	{
		this.Town = town;
	}
	public void setStatus(String status)
	{
		this.Status = status;
	}
}