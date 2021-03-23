public class Main
{
	public static void main(String[] args) {
		String nameone = "Tanishka";
		String nametwo = "Tanu";
		String namethree = new String("Tanishka");
		System.out.println("compare nameone and nametwo  " + nameone==nametwo);
		System.out.println("compare nameone and namethree  " + nameone==namethree);
		System.out.println("compare nameone and nametwo  " + nameone.equals(nametwo));
		System.out.println("compare nameone and namethree  " + nameone.equals(namethree));
	}
}
