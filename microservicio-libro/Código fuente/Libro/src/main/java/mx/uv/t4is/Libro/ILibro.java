package mx.uv.t4is.Libro;

import org.springframework.data.repository.CrudRepository;

public interface ILibro extends CrudRepository<Libro,Integer>{
    
    //Método para realizar busquedas personalizadas, en este caso debemos indicar el id del libro y su titulo
    Iterable<Libro> findByIdAndTitulo(int id, String titulo);

}
