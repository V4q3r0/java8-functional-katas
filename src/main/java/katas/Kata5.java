package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static double execute() {
        List<Movie> movies = DataUtil.getMovies();

        return DataUtil.getMovies()
                .stream().map(movie -> movie.getRating())
                .reduce(0.0, (acum, act) -> acum < act ? acum = act : acum);
    }
}
