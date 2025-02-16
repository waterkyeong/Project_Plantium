package pnu.edu.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "freeboardimgs")
public class FreeBoardImgs {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fimgid;
	@Column(length = 100, nullable = false)
	private String fimgname;
	@Column(length = 100, nullable = false)
	private String fimgoriname;
	
	@JsonIgnore
	@ManyToOne(optional = true)	@JoinColumn(name = "free_board_id")
	private FreeBoard freeboard;
}
