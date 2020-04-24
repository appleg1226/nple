package com.nple.domain.clips;

import com.nple.domain.Clip;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@Table(name = "tbl_wordclip")
public class WordClip extends Clip {

    private String paragraph;
}