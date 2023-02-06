package com.app.pojos;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
}
