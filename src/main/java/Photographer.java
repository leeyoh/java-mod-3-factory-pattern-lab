public class Photographer {
    Camera cam;
    public Photographer(){
        CameraFactory camF = new CameraFactory();
        cam = camF.getCamera(CameraManufacturer.Sony);
    }
    public void takePhotograph(){
        cam.takePhotograph();
    }
}
