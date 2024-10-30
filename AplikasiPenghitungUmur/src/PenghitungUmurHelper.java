import java.time.LocalDate;
import java.time.Period;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS ROG
 */
public class PenghitungUmurHelper {
    public String hitungUmurDetail (LocalDate lahir, LocalDate sekarang){
        Period period = Period.between(lahir, sekarang);
        return  period.getYears() + " tahun, " + period.getMonths() + "  bulan, " + period.getDays() + " hari";}
    
    public LocalDate hariUlangTahunBerikutnya(LocalDate lahir, LocalDate
        sekarang) {
        LocalDate ulangTahunBerikutnya =
        lahir.withYear(sekarang.getYear());
        if (!ulangTahunBerikutnya.isAfter(sekarang)) {
        ulangTahunBerikutnya = ulangTahunBerikutnya.plusYears(1);
        }
        return ulangTahunBerikutnya;
        }
    
    public String getDayOfWeekInIndonesian(LocalDate date) {
        return switch (date.getDayOfWeek()) {
            case MONDAY -> "Senin";
            case TUESDAY -> "Selasa";
            case WEDNESDAY -> "Rabu";
            case THURSDAY -> "Kamis";
            case FRIDAY -> "Jumat";
            case SATURDAY -> "Sabtu";
            case SUNDAY -> "Minggu";
            default -> "";
        };
}
    
}
