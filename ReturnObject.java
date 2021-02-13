class BalloonVolume
{
    double intialvolume;
    BalloonVolume(double a){
        intialvolume=a;
    }
    
    BalloonVolume changeVolume(double volume, BalloonVolume bv)
    {
        BalloonVolume Bv = new BalloonVolume(bv.intialvolume+volume);
        return Bv; 
    }
    
}

public class ReturnObject
{
	public static void main(String[] args) {
	BalloonVolume object = new BalloonVolume(10.2);
	double radius=3.14;
	double volume=(4*3.14*radius*radius*radius)/3;
	BalloonVolume ans=object.changeVolume(volume,object);

	System.out.println("New volume after expansion is: "+ans.intialvolume );
	}
}
