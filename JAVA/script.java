document.addEventListener("DOMContentLoaded", function () {
    // Seleciona o formulário
    const form = document.querySelector(".form-cadastro");

    // Adiciona um evento de escuta para o envio do formulário
    form.addEventListener("submit", function (event) {
        event.preventDefault(); // Impede o envio padrão do formulário

        // Exibe uma mensagem de sucesso
        alert("Cadastro realizado com sucesso!");

        // Redireciona para a página perfil.html
        window.location.href = "perfil.html";
    });
});
