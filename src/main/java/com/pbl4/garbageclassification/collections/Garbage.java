package com.pbl4.garbageclassification.collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "garbage")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Garbage {
    @Id
    private String gabargeId;
    private Set<String> images;
    private String kindOfGarbage;
    private String numOfBin;

}
