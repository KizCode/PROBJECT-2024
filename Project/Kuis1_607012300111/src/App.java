import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        SepedaBeam beam1 = new SepedaBeam(1);
        SepedaBeam beam2 = new SepedaBeam(2);
        SepedaBeam beam3 = new SepedaBeam(3);
        SepedaBeam beam4 = new SepedaBeam(4);
        SepedaBeam beam5 = new SepedaBeam(5);

        beam1.setDayaBaterai(0.5);
        beam2.setDayaBaterai(0.6);
        beam3.setDayaBaterai(0.7);
        beam4.setDayaBaterai(0.8);
        beam5.setDayaBaterai(0.9);

        beam1.setStatus(beam1.getDayaBaterai() < 0.7 ? "dipakai" : (beam1.getDayaBaterai() < 0.5 ? "rusak" : "parkir"));
        beam2.setStatus(beam2.getDayaBaterai() < 0.7 ? "dipakai" : (beam2.getDayaBaterai() < 0.5 ? "rusak" : "parkir"));
        beam3.setStatus(beam3.getDayaBaterai() < 0.7 ? "dipakai" : (beam3.getDayaBaterai() < 0.5 ? "rusak" : "parkir"));
        beam4.setStatus(beam4.getDayaBaterai() < 0.7 ? "dipakai" : (beam4.getDayaBaterai() < 0.5 ? "rusak" : "parkir"));
        beam5.setStatus(beam5.getDayaBaterai() < 0.7 ? "dipakai" : (beam5.getDayaBaterai() < 0.5 ? "rusak" : "parkir"));

        ArrayList<SepedaBeam> beamAreaTelU = new ArrayList<>();
        beamAreaTelU.add(beam1);
        beamAreaTelU.add(beam2);
        beamAreaTelU.add(beam3);
        beamAreaTelU.add(beam4);
        beamAreaTelU.add(beam5);

        for (SepedaBeam beam : beamAreaTelU) {
            System.out.println("id " + beam.getId() + " status: " + beam.getStatus() + " (baterai: " + beam.getDayaBaterai() * 100 + " %)");
        }
    }
}

