class population{
	public static void main(String[] args) 
	{
		long curpop = 312032486;
		final long seconds = (365*24*60*60)*5;
        long birth = seconds/7;
        long death = seconds/13;
        long imm = seconds/45;

        long newpop =curpop+birth-death+imm;
        System.out.println("The current population is:"+curpop);
        System.out.println("The new population is:"+newpop);
	}
}