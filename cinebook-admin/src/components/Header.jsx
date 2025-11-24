export default function AdminHeader() {
  const handleLogout = () => {
    localStorage.clear()
    window.location.href = "/login"
  }

  return (
    <div className="w-full bg-[#8CE4FF] p-4 flex justify-between items-center shadow">
      <h2 className="text-xl font-semibold">Admin Dashboard</h2>
      <button
        onClick={handleLogout}
        className="bg-[#FF5656] px-4 py-2 rounded text-white"
      >
        Logout
      </button>
    </div>
  )
}
