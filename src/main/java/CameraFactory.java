public class CameraFactory {
    public Camera getCamera(CameraManufacturer manufacturer){

        if(manufacturer == CameraManufacturer.Canon){
            return new Canon();
        }
        if(manufacturer == CameraManufacturer.Nikon){
            return new Nikon();
        }
        if(manufacturer == CameraManufacturer.Sony){
            return new Sony();
        }
        return null;
    }
}

class Nikon implements Camera{
    @Override
    public void takePhotograph() {
        System.out.println("Nikon Camera Snap");
    }
}
class Canon implements Camera{
    @Override
    public void takePhotograph() {
        System.out.println("Canon Camera Snap");
    }
}
class Sony implements Camera{
    @Override
    public void takePhotograph() {
        System.out.println("Sony Camera Snap");
    }
}