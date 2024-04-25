package br.com.workfacul.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		
		public ResourceNotFoundException(Object id) {
			super("Não foi localizado um usuário com o id" + id);
		}
}
