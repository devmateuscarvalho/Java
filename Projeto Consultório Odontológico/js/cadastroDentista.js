$(() => {
    listarDentistas()
    $("#enviarDentista").on("click", () => {
        const dentista = {
            nome: $("#nomeDentista").val(),
            especializacao: $("#especializacao").val()
        }
        cadastroDentista(dentista, "dentista");
    })


    $(document).on("click", ".removerDentista", function() {
        let botao = $(this);
        console.log($(this).attr("id"));
        removerDentista($(this).attr("id"), "dentista");
    })
})

function cadastroDentista(data, rota) {
    let r = "";
    switch (rota) {
        case "dentista":
            r = "/dentista";
            break;
    }
    $.ajax({
            method: (data.id ? "PUT" : "POST"),
            url: "http://localhost:8080" + r,
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
        })
        .then(response => {
            console.log(response);
            listarDentistas();

        })
        .fail(error => {
            console.log(error)
        })
}

function listarDentistas() {
    $.ajax({
            method: "GET",
            url: "http://localhost:8080/dentista"
        })
        .then(response => {
            let linhas = "";
            $("#listarNomeDentista").html("")
            response.forEach(el => {
                linhas +=
                    `
                <tr>
                <td>${el.id}</td>
                <td>${el.nome}</td>
                <td>${el.especializacao}</td>
                <td><button class="removerDentista btn btn-danger" id="${el.id}">REMOVER</button></td>
                </tr>
                `
                $("#listarNomeDentista").append(`
                <option value="${el.id}">${el.nome}</option>
                `)
            });

            $("#listaDentistas tbody").html(linhas);
            console.log(response);

        })

    .fail(error => {
        console.log(error)
    })

}

function removerDentista(id, rota) {
    let r = "";
    switch (rota) {
        case "dentista":
            r = `/dentista/${id}`;
            break;
    }
    $.ajax({
            method: "DELETE",
            url: "http://localhost:8080" + r
        })
        .then(response => {
            console.log(response);
            listarDentistas()
        })
        .fail(error => {
            console.log(error)
        })
}