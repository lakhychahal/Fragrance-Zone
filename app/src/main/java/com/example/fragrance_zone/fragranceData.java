package com.example.fragrance_zone;

public class fragranceData {

    private String PerfumeName;
    private String PerfumeDetails;
    private String MovieImage;

    public fragranceData(String perfumeName, String perfumeDetails, String movieImage) {
        PerfumeName = perfumeName;
        PerfumeDetails = perfumeDetails;
        MovieImage = movieImage;
    }

    public String getPerfumeName() {
        return PerfumeName;
    }

    public void setPerfumeName(String perfumeName) {
        PerfumeName = perfumeName;
    }

    public String getPerfumeDetails() {
        return PerfumeDetails;
    }

    public void setPerfumeDetails(String perfumeDetails) {
        PerfumeDetails = perfumeDetails;
    }

    public String getMovieImage() {
        return MovieImage;
    }

    public void setMovieImage(String movieImage) {
        MovieImage = movieImage;
    }
}
