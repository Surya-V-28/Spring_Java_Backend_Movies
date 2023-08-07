package dev.suryaarmy.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;


@Document(collection="movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class movies {
    @Id

    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private List<String> genres;

    private String trailerLink;

    private String poster;

    private  List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;


}
