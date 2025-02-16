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
@Table(name = "shareboardimgs")
public class ShareBoardImgs {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int simgid;
	@Column(length = 100, nullable = false)
	private String simgname;
	@Column(length = 100, nullable = false)
	private String simgoriname;
	
	@JsonIgnore
	@ManyToOne(optional = true)	@JoinColumn(name = "share_board_id") 
	private ShareBoard shareboard;
}
